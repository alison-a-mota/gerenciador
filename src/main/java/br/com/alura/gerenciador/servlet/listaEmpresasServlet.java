package br.com.alura.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/listaEmpresa")
public class listaEmpresasServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();
        req.setAttribute("empresas", lista);

        //chamar o JSP
        RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas.jsp");
        //passar o objeto para o JSP
        rd.forward(req, resp);

    }
}
