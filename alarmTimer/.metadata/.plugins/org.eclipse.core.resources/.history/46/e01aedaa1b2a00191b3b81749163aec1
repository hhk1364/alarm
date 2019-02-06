/*
 * package alarm;
 * 
 * import java.io.BufferedInputStream; import java.io.FileInputStream;
 * 
 * import javax.sound.sampled.AudioInputStream; import
 * javax.sound.sampled.AudioSystem; import javax.sound.sampled.Clip;
 * 
 * public class PlaySound {
 * 
 * private String audioFile;
 * 
 * private Clip clip;
 * 
 * private AudioInputStream audioInputStream;
 * 
 * 
 * 
 * public PlaySound(String file) {
 * 
 * this.audioFile = file;
 * 
 * }
 * 
 * 
 * 
 * public static void playsound() {
 * 
 * new PlaySound("sound/aram.wav").playAudioFile();
 * 
 * }
 * 
 * 
 * 
 * public void playAudioFile() {
 * 
 * try {
 * 
 * audioInputStream = AudioSystem.getAudioInputStream(
 * 
 * new BufferedInputStream(
 * 
 * new FileInputStream(audioFile)
 * 
 * )
 * 
 * );
 * 
 * 
 * 
 * clip = AudioSystem.getClip();
 * 
 * clip.open(audioInputStream);
 * 
 * 
 * 
 * clip.start();
 * 
 * while (clip.isActive()) {
 * 
 * try {
 * 
 * Thread.sleep(99);
 * 
 * } catch (Exception e) {
 * 
 * break;
 * 
 * }
 * 
 * }
 * 
 * clip.stop();
 * 
 * } catch (Exception e) {
 * 
 * e.printStackTrace();
 * 
 * } finally {
 * 
 * if (clip != null) {
 * 
 * try { clip.close(); } catch (Exception e) { }
 * 
 * }
 * 
 * }
 * 
 * }
 * 
 * }
 */