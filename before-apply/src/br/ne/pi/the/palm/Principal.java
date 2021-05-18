package br.ne.pi.the.palm;

public class Principal {

	public static void main(String[] args) throws PostJaPublicadoException{
		Post post = new Post();
		
		if(post.status.equals(PostStatus.RASCUNHO)){
			post.status = PostStatus.PUBLICADO;
		}else {
			throw new PostJaPublicadoException();
		}
	}
}
