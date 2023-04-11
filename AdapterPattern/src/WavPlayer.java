public class WavPlayer implements AdvancedMediaPlayer {
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
		// do nothing
		
	}

	@Override
	public void playWav(String fileName) {
		System.out.println("Playing wav file. Name: " + fileName);
		
	}
}