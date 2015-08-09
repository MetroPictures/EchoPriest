package MP.EchoPriest;

import processing.core.PApplet;
import processing.video.Movie;
import deeplab.MetroPictures.MPPCore;

@SuppressWarnings("serial")
public class EchoPriest extends MPPCore {
	
	Movie movie;
	
	@Override
	public void setup() {
		super.setup();
		
		// set dimensions + background colors + video...
		
		size(640, 480);
		
		System.out.println(media_dir);
		
		movie = new Movie(this, media_dir + "video/test_mov.mov");
		movie.loop();
	}
	
	@Override
	public void draw() {
		super.draw();
		image(movie, 0, 0);
	}
	
	public void movieEvent(Movie m) {
		m.read();
	}

	public static void main(String args[]) {
		PApplet.main(new String[] {"--present", "--hide-stop", EchoPriest.class.getName() });
	}
}
