package br.ne.pi.the.palm;

public class Post {
	
    private PostStatus status = PostStatus.RASCUNHO;
    
    public void publica() throws PostJaPublicadoException{
    	if(!this.status.equals(PostStatus.RASCUNHO)){
			throw new PostJaPublicadoException();
		}
    	
		this.status = PostStatus.PUBLICADO;
    }
}
