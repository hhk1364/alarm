 package alarm;
  
import java.io.File;

import javax.sound.sampled.AudioFormat;

import javax.sound.sampled.AudioInputStream;

import javax.sound.sampled.AudioSystem;

import javax.sound.sampled.Clip;

import javax.sound.sampled.DataLine;

import javax.swing.JFrame;


  public class PlaySound2 extends JFrame{

		Clip clip;  //.wav 파일 재생을위한 clip



		//이클립스의 src 폴더에 파일을 넣으면 자동으로 bin폴더에 파일이 복사됨. 그러므로 getResource 로 가져올 수 있음

		String path = PlaySound2.class.getResource("").getPath();

		

		public PlaySound2() {

			setTitle("AudioTest");

			

			File bgm;

			AudioInputStream stream;

			AudioFormat format;

			DataLine.Info info;

			bgm = new File(path+"aram.wav");

			

			try {

				stream = AudioSystem.getAudioInputStream(bgm);

				format = stream.getFormat();

				info = new DataLine.Info(Clip.class, format);

				clip = (Clip) AudioSystem.getLine(info);

				clip.open(stream);

				clip.start();

			} catch (Exception e) {

			}

			

			setBounds(300, 300, 300, 300);

			setVisible(true);

		}

		public static void playsound() {

			new PlaySound2();

		}

}