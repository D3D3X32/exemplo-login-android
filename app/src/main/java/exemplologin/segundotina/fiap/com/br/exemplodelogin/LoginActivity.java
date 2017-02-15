package exemplologin.segundotina.fiap.com.br.exemplodelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText edtUsuario;
    EditText edtSenha;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Informando que o campo do XML é um atributo do Java
        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
        edtSenha = (EditText) findViewById(R.id.edtSenha);

    }

    public void Logar(View v) {

        String Usuario = edtUsuario.getText().toString();
        String Senha = edtSenha.getText().toString();

        if (Usuario.toLowerCase().equals("fiap") && Senha.toLowerCase().equals("fiap123")){
            Intent t = new Intent(this, MainActivity.class);
            startActivity(t);
        }

        else {
            Toast.makeText(this, getString(R.string.mensagem_erro), Toast.LENGTH_SHORT).show();
        }


    }
}
