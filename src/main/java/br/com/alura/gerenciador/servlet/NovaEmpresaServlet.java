package br.com.alura.gerenciador.servlet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String nomeEmpresa = req.getParameter("nome");

        Empresa empresa = new Empresa();
        empresa.setNome(nomeEmpresa);

        Banco banco = new Banco();
        banco.adiciona(empresa);

        System.out.println("Cadastrando nova empresa " + nomeEmpresa);
        PrintWriter out = resp.getWriter();
        out.println("<html><body>Empresa " + nomeEmpresa + " cadastrada com sucesso</body></html>");
    }
}
