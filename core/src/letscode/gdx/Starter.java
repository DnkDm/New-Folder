package letscode.gdx;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Starter extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	private Panzer me;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		me = new Panzer(100, 200);
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 1, 1, 1);
		batch.begin();
		batch.draw(img, 500, 500);
		me.render(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		me.dispose();
	}
}
