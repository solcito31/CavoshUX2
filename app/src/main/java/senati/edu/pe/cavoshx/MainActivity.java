package senati.edu.pe.cavoshx;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import senati.edu.pe.cavoshx.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupWithNavController(binding.navView, navController);
        navController.addOnDestinationChangedListener( (navController1, navDestination, bundle) -> {
            int id =navDestination.getId();
            if ( id == R.id.navigation_splash || id == R.id.navigation_login ||
                 id == R.id.navigation_registrar || id ==R.id.navigation_verificar ||
                    id== R.id.navigation_pedidoSeleccionar || id == R.id.navigation_pedidoPersonalizar
            )
                navView.setVisibility((BottomNavigationView.INVISIBLE));



        } );
    }

}


