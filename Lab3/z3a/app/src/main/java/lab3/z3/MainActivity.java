package lab3.z3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    EditText email, to, subject, message;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.email);
        to = (EditText) findViewById(R.id.to);
        subject = (EditText) findViewById(R.id.subject);
        message = (EditText) findViewById(R.id.message);

        send = (Button) findViewById(R.id.send);

        send.setOnClickListener(v -> {
            String mail = email.getText().toString();
            String recipient = to.getText().toString();
            String subj = subject.getText().toString();
            String mess = message.getText().toString();

            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_EMAIL, new String[] {mail});
            intent.putExtra(Intent.EXTRA_EMAIL, new String[] {recipient});
            intent.putExtra(Intent.EXTRA_SUBJECT, subj);
            intent.putExtra(Intent.EXTRA_TEXT, mess);

            intent.setType("message/rfc882");
            startActivity(Intent.createChooser(intent, "Wybierz aplikacje e-mail"));
        });
    }
}