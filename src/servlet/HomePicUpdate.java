package servlet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import dao.HumanDao;
import entity.HumanInfo;
import util.RecongnizationByAI;

public class HomePicUpdate extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		
		String humanName="";
		String imgUrl="";
		
		String imagePath="";
		try {
			DiskFileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			// 设置上传文件的大小限制为1M
			factory.setSizeThreshold(1024 * 1024);

			List items = null;
			try {
				items = upload.parseRequest(request);
			} catch (FileUploadException e) {
				e.printStackTrace();
			}

			Iterator iter = items.iterator();
			while (iter.hasNext()) {
				FileItem item = (FileItem) iter.next();
				if (!item.isFormField()) {

					// 根据时间戳创建头像文件
					String filename = System.currentTimeMillis() + ".jpg";
					String photoFolder = request.getServletContext().getRealPath("uploaded");
					// System.out.println(photoFolder);
					File f = new File(photoFolder, filename);
					f.getParentFile().mkdirs();

					// 获取该图片绝对路径，然后利用构造函数传给百度AI类
					imagePath = f.getAbsolutePath();
					System.out.println(imagePath);
					// System.out.println(imagePath);

					// 通过item.getInputStream()获取浏览器上传的文件的输入流
					InputStream is = item.getInputStream();

					// 复制文件
					FileOutputStream fos = new FileOutputStream(f);
					byte b[] = new byte[1024 * 1024];
					int length = 0;
					while (-1 != (length = is.read(b))) {
						fos.write(b, 0, length);
					}
					fos.close();

				} 
				
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String carcard = RecongnizationByAI.Recongnize(imagePath);
		
		HumanInfo human = new HumanInfo();
		human.setHumanName(humanName);

		new HumanDao().add(human);
		
		response.sendRedirect("Result");
	}

}
