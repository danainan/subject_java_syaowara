public class M4vPlayer implements AdvancedMediaPlayer {
	@Override
	public void playVlc(String fileName) {
		// do nothing
	}

	@Override
	public void playMp4(String fileName) {
		// do nothing
	}

	@Override
	public void playM4v(String fileName) {
		System.out.println("Playing m4v file. Name: " + fileName);
		
	}

	@Override
	public void playWav(String fileName) {
		// TODO Auto-generated method stub
		
	}
}