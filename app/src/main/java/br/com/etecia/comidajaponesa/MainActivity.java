package br.com.etecia.comidajaponesa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    String[] nameComida = {"Hamburguer Special", "Batata Frita", "Suco de Laranja", "Pizza", "Nugget", "Coca - Cola"};
    String[] nameTempo = {"15 min","7 min", "8 min", "25 min", "8 min", "5 seg"};
    int[] imageComida = {R.drawable.ramburguer, R.drawable.batata, R.drawable.suco, R.drawable.pizza, R.drawable.nugget, R.drawable.coca};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gvExplore);

        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return imageComida.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {

            View view1 = getLayoutInflater().inflate(R.layout.modelo_cardview, null);

            TextView Comida = (TextView) view1.findViewById(R.id.txtTexto);
            TextView Tempo = (TextView) view1.findViewById(R.id.txtTempo);
            ImageView imgComida = (ImageView) view1.findViewById(R.id.imgImagem);

            Comida.setText(nameComida[position]);
            Tempo.setText(nameTempo[position]);
            imgComida.setImageResource(imageComida[position]);
            return view1;
        }
    }
}
