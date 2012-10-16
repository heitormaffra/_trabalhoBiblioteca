<%-- 
    Document   : cadUsuario
    Created on : 07/10/2012, 17:52:57
    Author     : fabintk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de usuario</title>
    </head>
    <body>
        <div>
            <h1>Bem vindo ao cadastro de usuário</h1>

            <form name="cadUsuario" action="cadastrar">

                Nome:           <input type="text" name="txtNome" value="" /></br>
                Telefone:       <input type="text" name="txtTelefone" value="" /></br>
                Endereco:       <input type="text" name="txtEndereco" value="" /></br>
                Email:          <input type="text" name="txtEmail" value="" /></br>
                Usuário Ativo   <input type="checkbox" name="txtAtivo" value="ativo" /><br />
                Usuário Inativo <input type="checkbox" name="txtInativo" value="inativo" /><br />
                <input type="submit" value="OK" />
            </form>
        </div>
    </body>
</html>
