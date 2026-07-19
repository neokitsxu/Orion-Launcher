package net.kdt.pojavlaunch;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import java.io.File;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Mods Installer Button
        Button btnMods = findViewById(R.id.btn_mods);
        btnMods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    File modsDir = new File(getExternalFilesDir(null), ".minecraft/mods");
                    if (!modsDir.exists()) modsDir.mkdirs();
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromFile(modsDir));
                    startActivity(intent);
                } catch (Exception e) {
                    // Handle error
                }
            }
        });
        
        // World Installer Button
        Button btnWorlds = findViewById(R.id.btn_worlds);
        btnWorlds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    File savesDir = new File(getExternalFilesDir(null), ".minecraft/saves");
                    if (!savesDir.exists()) savesDir.mkdirs();
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromFile(savesDir));
                    startActivity(intent);
                } catch (Exception e) {
                    // Handle error
                }
            }
        });
        
        // Texture Pack Installer Button
        Button btnTexturePacks = findViewById(R.id.btn_texturepacks);
        btnTexturePacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    File rpDir = new File(getExternalFilesDir(null), ".minecraft/resourcepacks");
                    if (!rpDir.exists()) rpDir.mkdirs();
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.fromFile(rpDir));
                    startActivity(intent);
                } catch (Exception e) {
                    // Handle error
                }
            }
        });
        
        // Play Button (Launch Minecraft)
        Button btnPlay = findViewById(R.id.btn_play);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // MojoLauncher's existing launch function
                // Call the existing launch method here
                // For now, just show a toast
                android.widget.Toast.makeText(MainActivity.this, "Launching Minecraft...", android.widget.Toast.LENGTH_SHORT).show();
            }
        });
    }
}2
