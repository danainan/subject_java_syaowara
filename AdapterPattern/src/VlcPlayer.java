public class VlcPlayer implements AdvancedMediaPlayer {
	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// do nothing
	}

	@Override
	public void playM4v(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playWav(String fileName) {
		// TODO Auto-generated method stub
		
	}
}