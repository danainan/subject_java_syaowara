public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer advancedMusicPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer = new Mp4Player();
		} else if (audioType.equalsIgnoreCase("m4v")) {
			advancedMusicPlayer = new M4vPlayer();
		} else if (audioType.equalsIgnoreCase("wav")) {
			advancedMusicPlayer = new WavPlayer();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.playMp4(fileName);
		} else if (audioType.equalsIgnoreCase("m4v")) {
			advancedMusicPlayer.playM4v(fileName);
		} else if (audioType.equalsIgnoreCase("wav")) {
			advancedMusicPlayer.playWav(fileName);
		}
	}
	
}
