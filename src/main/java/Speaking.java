import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/*import java.io.FileOutputStream;
import com.voicerss.tts.AudioCodec;
import com.voicerss.tts.AudioFormat;
import com.voicerss.tts.Languages;
import com.voicerss.tts.SpeechDataEvent;
import com.voicerss.tts.SpeechDataEventListener;
import com.voicerss.tts.SpeechErrorEvent;
import com.voicerss.tts.SpeechErrorEventListener;
import com.voicerss.tts.VoiceParameters;
import com.voicerss.tts.VoiceProvider;*/


import javax.sound.sampled.*;

public class Speaking {

        public static void main (String args[]) throws Exception {
            /*Read voice*/
            try {
                File yourFile = new File("pass_German.mp3");
                AudioInputStream stream;
                System.out.println("stream initialized");
                AudioFormat format;
                System.out.println("format initialized");
                DataLine.Info info;
                System.out.println("info initialized");
                Clip clip;
                System.out.println("clip initialized");

                stream = AudioSystem.getAudioInputStream(yourFile);
                System.out.println("yourFile gotten in getAudioInputStream");
                format = stream.getFormat();
                System.out.println("yourFile format gotten");
                info = new DataLine.Info(Clip.class, format);
                System.out.println("info DataLine read");
                clip = (Clip) AudioSystem.getLine(info);
                System.out.println("clip getline done");
                clip.open(stream);
                System.out.println("clip stream opened");
                clip.start();
                System.out.println("clip started");
                Thread.sleep(5000);
            }
            catch (Exception e) {
                System.out.println("You are wrong");
            }


/*
Create text to voice
*/
            /*VoiceProvider tts = new VoiceProvider("bf06fa0940744a21b16e68baeb3b4388");

            VoiceParameters params = new VoiceParameters("Du hast gerade einen Menschen gerettet, tolle Arbeit!",
                    Languages.German_Germany);
            params.setCodec(AudioCodec.WAV);

            params.setFormat(AudioFormat.Format_44KHZ.AF_44khz_8bit_stereo);
            params.setBase64(false);
            params.setSSML(false);
            params.setRate(0);

            tts.addSpeechErrorEventListener(new SpeechErrorEventListener() {
                @Override
                public void handleSpeechErrorEvent(SpeechErrorEvent e) {
                    System.out.print(e.getException().getMessage());
                }
            });

            tts.addSpeechDataEventListener(new SpeechDataEventListener() {
                @Override
                public void handleSpeechDataEvent(SpeechDataEvent e) {
                    try {
                        byte[] voice = (byte[])e.getData();

                        FileOutputStream fos = new FileOutputStream("pass_German.mp3");
                        fos.write(voice, 0, voice.length);
                        fos.flush();
                        fos.close();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });

            tts.speechAsync(params);*/
        }
}
