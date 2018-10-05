package in.coderaashna.thirteenvalues;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int index = 0;
    String array[] = {
            "1. Temperance. Eat not to dullness; drink not to elevation. ",
            "2. Silence. Speak not but what may benefit others or yourself; avoid trifling conversation.",
            "3. Order. Let all your things have their places; let each part of your business have its time. ",
            "4. Resolution. Resolve to perform what you ought; perform without fail what you resolve. ",
            "5. Frugality. Make no expense but to do good to others or yourself; i.e., waste nothing. ",
            "6. Industry. Lose no time; be always employ'd in something useful; cut off all unnecessary actions. ",
            "7. Sincerity. Use no hurtful deceit; think innocently and justly, and, if you speak, speak accordingly. ",
            "8. Justice. Wrong none by doing injuries, or omitting the benefits that are your duty. ",
            "9. Moderation. Avoid extremes; forbear resenting injuries so much as you think they deserve. ",
            "10. Cleanliness. Tolerate no uncleanliness in body, cloaths, or habitation. ",
            "11. Tranquillity. Be not disturbed at trifles, or at accidents common or unavoidable.",
            "12. Chastity. Rarely use venery but for health or offspring, never to dullness, weakness, or the injury of your own or another's peace or reputation. ",
            "13. Humility. Imitate Jesus and Socrates. "
    };
    TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg = (TextView) findViewById(R.id.msg);
        msg.setText(array[0]);
    }

    public void buttonClickedPrev(View v) {
        index--;
        if (index < 0)
            index = array.length - 1;
        msg.setText(array[index]);
    }

    public void buttonClickedNext(View v) {
        index++;
        if (index >= array.length)
            index = 0;
        msg.setText(array[index]);
    }
}
