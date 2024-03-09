import java.util.*;

class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private String isbn;

    public Livro(String titulo, String autor, String editora, int anoPublicacao, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String getEditora(){
        return editora;
    }
    
    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    
    public String getIsb(){
        return isbn;
    }
}

class Usuario {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    
    public Usuario(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public String getEmail(){
        return email;
    }
}

class SistemaBiblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private Map<Livro, Usuario> emprestimos;
    
    public SistemaBiblioteca(){
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        emprestimos = new HashMap<>();
    }
    
    public void cadastrarLivro (Livro livro) {
        livros.add(livro);
    }
    
    public void cadastrarUsuario (Usuario usuario) {
        usuarios.add(usuario);
        }
        
        public void realizarEmprestimo (Livro livro, Usuario usuario) {
        emprestimos.put(livro, usuario);
        }
        
        public void realizarDevolucao (Livro livro) {
        emprestimos.remove(livro);
        }
        
        public List<Livro> consultarPorTitulo (String titulo) {
        List<Livro> resultado = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                resultado.add(livro);
                }
            }
        return resultado;
        }
        
        public Livro consultarPorISBN(String isbn){
        for (Livro livro : livros) {
            if (livro.getIsb().equals(isbn)){
                return livro;
                }
            }
            return null;
        }
}