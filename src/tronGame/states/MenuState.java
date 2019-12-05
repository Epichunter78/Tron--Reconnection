package tronGame.states;

import java.awt.Graphics;

import tronGame.Handler;
import tronGame.gfx.Assets;
import tronGame.ui.ClickListener;
import tronGame.ui.UIImageButton;
import tronGame.ui.UIManager;

public class MenuState extends State {

	private UIManager uiManager;

	public MenuState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);

		uiManager.addObject(new UIImageButton(200, 200, 128, 64, Assets.btn_start, Assets.btn_start_pressed, new ClickListener() {
			@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				State.setState(handler.getGame().getGameState());
			}
		}));
	}

	@Override
	public void tick() {
		uiManager.tick();
		handler.getMouseManager().setUIManager(null);
		State.setState(handler.getGame().getGameState());
	}

	@Override
	public void render(Graphics g) {
		uiManager.render(g);
	}

}
