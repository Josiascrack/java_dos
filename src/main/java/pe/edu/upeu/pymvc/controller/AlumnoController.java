package pe.edu.upeu.pymvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import pe.edu.upeu.pymvc.dao.AlumnoDao;
import pe.edu.upeu.pymvc.daoImpl.AlumnoDaoImp;
import pe.edu.upeu.pymvc.model.Alumno;


/**
 * Servlet implementation class AlumnoController
 */
public class AlumnoController extends HttpServlet {
	private AlumnoDao rdao = new AlumnoDaoImp();
	private Gson gson = new Gson();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlumnoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		int opcion = Integer.parseInt(request.getParameter("opc"));//opc='1'
		switch (opcion) {
		case 1://todos los roles
				out.println(gson.toJson(rdao.readAll()));
			break;
		case 2://guardar
			out.println(gson.toJson(rdao.create(new Alumno(opcion, request.getParameter("nombre"), request.getParameter("telefono"),request.getParameter("direccion")))));
			break;
		case 3://read
			out.println(gson.toJson(rdao.read(Integer.parseInt(request.getParameter("idalum")))));
			break;
		case 4://modificar
			Alumno r = new Alumno();
			r.setIdalum(Integer.parseInt(request.getParameter("idalum")));
			r.setNombre(request.getParameter("nombre"));
			r.setTelefono(request.getParameter("telefono"));
			r.setDireccion(request.getParameter("direccion"));
			out.println(gson.toJson(rdao.update(r)));
			break;
		case 5://eliminar
			out.println(gson.toJson(rdao.delete(Integer.parseInt(request.getParameter("idalum")))));
			break;
		default:
			break;
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
