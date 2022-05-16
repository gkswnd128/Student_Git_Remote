package Controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.StudentDAO;
import DTO.StudentDTO;


@WebServlet("*.student")
public class StudentController extends HttpServlet {
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri = request.getRequestURI();
		StudentDAO dao = new StudentDAO();
		System.out.println(uri);
		
		try {

			if(uri.equals("/create.student")) { // 한중
				if(uri.equals("/add.std")) {
					String name = request.getParameter("name");
					int kor = Integer.parseInt(request.getParameter("kor"));
					int eng = Integer.parseInt(request.getParameter("eng"));
					int math = Integer.parseInt(request.getParameter("math"));

					int result = dao.insert(new StudentDTO(0,0,name,kor,eng,math,null));
					response.sendRedirect("index.jsp");
				
			} else if (uri.equals("/read.student")) { // 서호
			
				List<StudentDTO> list = dao.selectAll();
				request.setAttribute("list", list);
				
				request.getRequestDispatcher("read.jsp").forward(request, response);
				
				
				
			} else if (uri.equals("/delete.student")){
				int sid = Integer.parseInt(request.getParameter("sid"));
				dao.delete(sid);
				response.sendRedirect("/deleteList.student");
					
			} else if (uri.equals("/deleteList.student")){
				List<StudentDTO> list = dao.selectAll();
				request.setAttribute("list", list);
				request.getRequestDispatcher("delete.jsp").forward(request, response);
						
				
			} else if (uri.equals("/update.student")) { // 세훈
				
				
				
				
			}
						
		}catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("error.html");
		}
		
		
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
