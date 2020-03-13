/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Beans.loginBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelsDb.Empleado;
import modelsDb.Cliente;

/**
 *
 * @author pixuuh
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class LoginServlet extends HttpServlet {

    @EJB
    private loginBeanLocal loginBean;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getRequestURI().split("/")[3];
        String vista="/";
        switch (action){
            case "Login":
            vista = "/inicioSesion.jsp";
            break;
            case "LoginEmpleado":
            vista ="/inicioSesionE.jsp";
            
            default:
            vista = "indexClinicaLindaS.jsp";
        }
        request.getRequestDispatcher(vista).forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getRequestURI().split("/")[3];
        String vista = "/";
        String usuarioCli,passwordCli;
        String usuarioEmp,passwordEmp;
        Empleado emp = new Empleado();
        Cliente cli =new Cliente();
        switch (action){
            case "Login":
                usuarioCli=request.getParameter("usuario_cli");
                passwordCli=request.getParameter("password_cli");
                try{
                    if(loginBean.login(usuarioCli, passwordCli)==true){
                        vista="/solicitudCitaC.jsp";
                    }else{
                        vista="/inicioSesion.jsp";
                    }
                }catch(Exception ex){
                    
                }
                break;
                
                
            case "LoginEmpleado":
                usuarioEmp= request.getParameter("usuario_emp");
                passwordEmp =request.getParameter("password_emp");
                try{
                    if(loginBean.loginEmpleado(usuarioEmp, passwordEmp)==true){
                        emp=loginBean.obtenerEmpleado(usuarioEmp);
                        if(emp.getIdTipoe().getCargo().toString().equals("1")){
                            vista="/menuEmpleadoA.jsp";
                            
                        }else if(emp.getIdTipoe().getCargo().toString().equals("2")){
                            vista="/citasGuardadasM.jsp";
                        }else if (emp.getIdTipoe().getCargo().toString().equals("3")) {
                            vista="/solicitudCitasR.jsp";
                        }
                    }else{
                        vista = "/inicioSesionE.jsp";
                    }
        }catch (Exception ex){
            
        }break;
        
            default:
                vista="/inicioSesion.jsp";
        }
        request.getRequestDispatcher(vista).forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
