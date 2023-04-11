public class Mp4Player implements AdvancedMediaPlayer {
	@Override
	public void playVlc(String fileName) {
		// do nothing
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: " + fileName);
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