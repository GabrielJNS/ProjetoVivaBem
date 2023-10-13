package Dados;

public class Login
{
    private String nome;
    private String senha;
   

    public Login() 
    {
        this.nome=null;
        this.senha=null;
          
    }

    public Login(String nome, String senha)
    {
        this.nome = nome;
        this.senha = senha;
         
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getSenha()
    {
        return senha;
    }
    
    public void setSenha(String senha)
    {
        this.senha = senha;
    }
    
}
