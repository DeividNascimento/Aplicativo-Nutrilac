package com.example.nutrilac.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nutrilac.R;
import com.example.nutrilac.dao.PacoteAnimaisDAO;
import com.example.nutrilac.dao.PacoteLotesDAO;
import com.example.nutrilac.model.PacoteAnimais;
import com.example.nutrilac.model.PacoteLotes;
import com.example.nutrilac.ui.adapter.ListaPacotesAnimaisAdapter;
import com.example.nutrilac.ui.adapter.ListaPacotesLotesAdapter;
import com.google.android.material.navigation.NavigationView;

import java.util.List;

public class ListaAnimaisActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "Lista de animais";
    private DrawerLayout mdrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private NavigationView navigatView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_animais);
        setTitle(TITLE_APPBAR);

        configuraMenu();

        configuraBotoes();

        configuraLista();
    }

    private void configuraMenu() {
        mdrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mdrawerLayout, R.string.open,R.string.close);
        mdrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigatView = (NavigationView) findViewById(R.id.navView);
        navigatView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu_inicio:
                        Intent intentInicio = new Intent(ListaAnimaisActivity.this, HomeActivity.class);
                        startActivity(intentInicio);
                        break;
                    case R.id.menu_relatorio:
                    case R.id.menu_minhaconta:
                    case R.id.menu_contato:
                    case R.id.menu_ajuda:
                        Toast.makeText(ListaAnimaisActivity.this,"Essa tela ainda será desenvolvida",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.menu_sairDaConta:
                        Intent intent = new Intent(ListaAnimaisActivity.this, TelaPrimeiroAcessoActivity.class);
                        startActivity(intent);
                        break;
                }
                return false;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void configuraLista() {
        ListView listaDePacotesAnimais = findViewById(R.id.lista_animais_listview);
        final List<PacoteAnimais> pacotes = new PacoteAnimaisDAO().lista();
        listaDePacotesAnimais.setAdapter(new ListaPacotesAnimaisAdapter(pacotes,this));
    }

    private void configuraBotoes() {
        TextView botaoCadastrarAnimal = findViewById(R.id.lista_lotes_button_cadastrar_animal);
        botaoCadastrarAnimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListaAnimaisActivity.this, CadastrarAnimalActivity.class);
                startActivity(intent);
            }
        });
    }
}
