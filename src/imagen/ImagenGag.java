package imagen;

public class ImagenGag {
	
	private PostGetter pg;
	
	public ImagenGag() {
		this.pg = new ActualPost();
	}
	
	public ImagenGag(PostGetter pg) {
		this.pg = pg;
	}
	
	public Post getPost() {
		return pg.getPost();
	}
	
}
