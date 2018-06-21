package imagenTest;

import org.junit.Assert;
import org.junit.Test;

import imagen.ImagenGag;
import imagen.Post;
import imagen.PostMock;

public class Ventana9gagTest { 

	@Test
	public void queElMockFunciona() {
		ImagenGag ig = new ImagenGag(new PostMock());
		Post p = ig.getPost();
		Assert.assertNotNull(p.getLink());
		Assert.assertNotNull(p.getTitulo());
		Assert.assertEquals(p.getLink(), "img/a0KO8QL_460s.jpg");
		Assert.assertEquals(p.getTitulo(), "Arguments over. House has settled it");
	}
}
