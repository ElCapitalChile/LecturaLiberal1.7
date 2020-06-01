package com.elcapitalchile.lecturaliberal;


import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


import java.util.ArrayList;

import hotchemi.android.rate.AppRate;


public class MainActivity extends AppCompatActivity {
    ArrayList<String> list_name = new ArrayList<>();
    ArrayList<String> list_pais = new ArrayList<>();
    ArrayList<String> list_nacimiento = new ArrayList<>();
    ArrayList<Integer> list_image = new ArrayList<>();
    ArrayList<Integer> list_image2 = new ArrayList<>();
    private long mLastClickTime = 0;


    ListView lista;


    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation( ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdView mAdView = findViewById( R.id.adView );
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);




        AppRate.with(this)
                .setInstallDays(1)
                .setLaunchTimes(3)
                .setRemindInterval(2)
                .monitor();
        AppRate.showRateDialogIfMeetsConditions(this);

        lista = findViewById( R.id.milista );

        list_name.add("John Locke");
        list_name.add("Adam Smith");
        list_name.add("Thomas Paine");
        list_name.add("Benjamin Constant");
        list_name.add("David Ricardo");
        list_name.add("Fréderic Bastiat");
        list_name.add("Alexis de Tocqueville");
        list_name.add("John Stuart Mill");
        list_name.add("Juan Bautista Alberdi");
        list_name.add("Herbert Spencer");
        list_name.add("Carl Menger");
        list_name.add("John Dewey");
        list_name.add("Leonard Trelawny Hobhouse");
        list_name.add("Benedetto Croce");
        list_name.add("Ludwig Von Mises");
        list_name.add("Friedrich Hayek");
        list_name.add("Karl Popper");
        list_name.add("Raymond Aron");
        list_name.add("Isaiah Berlin");
        list_name.add("Norberto Bobbio");
        list_name.add("Milton Friedman");
        list_name.add("James M. Buchanan");
        list_name.add("John Rawls");
        list_name.add("Murray Rothbard");
        list_name.add("Ronald Dworkin");

        list_pais.add("Reino Unido");
        list_pais.add("Reino Unido");
        list_pais.add("Reino Unido");
        list_pais.add("Suiza");
        list_pais.add("Reino Unido");
        list_pais.add("Francia");
        list_pais.add("Francia");
        list_pais.add("Reino Unido");
        list_pais.add("Argentina");
        list_pais.add("Reino Unido");
        list_pais.add("Polonia");
        list_pais.add("Estados Unidos");
        list_pais.add("Reino Unido");
        list_pais.add("Italia");
        list_pais.add("Ucrania");
        list_pais.add("Austria");
        list_pais.add("Austria");
        list_pais.add("Francia");
        list_pais.add("Letonia");
        list_pais.add("Italia");
        list_pais.add("Estados Unidos");
        list_pais.add("Estados Unidos");
        list_pais.add("Estados Unidos");
        list_pais.add("Estados Unidos");
        list_pais.add("Estados Unidos");

        list_nacimiento.add("1632-1704");
        list_nacimiento.add("1723-1790");
        list_nacimiento.add("1737-1790");
        list_nacimiento.add("1767-1830");
        list_nacimiento.add("1772-1823");
        list_nacimiento.add("1801-1850");
        list_nacimiento.add("1805-1859");
        list_nacimiento.add("1805-1873");
        list_nacimiento.add("1810-1884");
        list_nacimiento.add("1820-1903");
        list_nacimiento.add("1840-1921");
        list_nacimiento.add("1859-1952");
        list_nacimiento.add("1864-1929");
        list_nacimiento.add("1866-1952");
        list_nacimiento.add("1881-1973");
        list_nacimiento.add("1899-1992");
        list_nacimiento.add("1902-1994");
        list_nacimiento.add("1905-1983");
        list_nacimiento.add("1909-1997");
        list_nacimiento.add("1909-2004");
        list_nacimiento.add("1912-2006");
        list_nacimiento.add("1919-2013");
        list_nacimiento.add("1921-2002");
        list_nacimiento.add("1926-1995");
        list_nacimiento.add("1931-2013");


        list_image.add(R.drawable.johnlockee);
        list_image.add(R.drawable.adamsmithh);
        list_image.add(R.drawable.thomaspainee);
        list_image.add(R.drawable.benjaminconstantderebecquee);
        list_image.add(R.drawable.davidricardoo);
        list_image.add(R.drawable.fredericbastiatt);
        list_image.add(R.drawable.alexisdetocquevillee);
        list_image.add(R.drawable.johnstuartmilll);
        list_image.add(R.drawable.juanbautistaa);
        list_image.add(R.drawable.herbertspencerr);
        list_image.add(R.drawable.carlmengerr);
        list_image.add(R.drawable.johndeweyy);
        list_image.add(R.drawable.leonardtrelawnyhobhousee);
        list_image.add(R.drawable.benedettocrocee);
        list_image.add(R.drawable.ludwigvonmisess);
        list_image.add(R.drawable.friedrichhayekk);
        list_image.add(R.drawable.karlpopperr);
        list_image.add(R.drawable.raymondaronn);
        list_image.add(R.drawable.isaiahberlinn);
        list_image.add(R.drawable.norbertobobbioo);
        list_image.add(R.drawable.miltonfriedmann);
        list_image.add(R.drawable.jamesmbuchanann);
        list_image.add(R.drawable.johnrawlss);
        list_image.add(R.drawable.murrayrothbardd);
        list_image.add(R.drawable.ronalddworkinn);

        list_image2.add(R.drawable.banderareinounido);
        list_image2.add(R.drawable.banderareinounido);
        list_image2.add(R.drawable.banderareinounido);
        list_image2.add(R.drawable.banderasuiza);
        list_image2.add(R.drawable.banderareinounido);
        list_image2.add(R.drawable.banderafrancia);
        list_image2.add(R.drawable.banderafrancia);
        list_image2.add(R.drawable.banderareinounido);
        list_image2.add(R.drawable.banderaargentina);
        list_image2.add(R.drawable.banderareinounido);
        list_image2.add(R.drawable.banderapolonia);
        list_image2.add(R.drawable.banderaeeuu);
        list_image2.add(R.drawable.banderareinounido);
        list_image2.add(R.drawable.banderaitalia);
        list_image2.add(R.drawable.banderaucrania);
        list_image2.add(R.drawable.banderaaustria);
        list_image2.add(R.drawable.banderaaustria);
        list_image2.add(R.drawable.banderafrancia);
        list_image2.add(R.drawable.banderaletonia);
        list_image2.add(R.drawable.banderaitalia);
        list_image2.add(R.drawable.banderaeeuu);
        list_image2.add(R.drawable.banderaeeuu);
        list_image2.add(R.drawable.banderaeeuu);
        list_image2.add(R.drawable.banderaeeuu);
        list_image2.add(R.drawable.banderaeeuu);


        Adapter Adapter = new Adapter(MainActivity.this,list_name,list_pais,list_nacimiento,list_image,list_image2);
        lista.setAdapter( Adapter );



        lista.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        if (position==0){
                            Intent myIntent = new Intent(view.getContext(), Bio.class);
                            startActivityForResult(myIntent, 0);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                            lista.setEnabled(false);
                            lista.setScrollingCacheEnabled(false);

                        }
                        else if (position ==1){
                            Intent myIntent = new Intent(view.getContext(), AdamSmith.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );

                        }

                        else if (position==2){
                            Intent myIntent = new Intent(view.getContext(), ThomasPaine.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }


                        else if (position==3){
                            Intent myIntent = new Intent(view.getContext(),BenjaminConstant.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }


                        else if (position==4){
                            Intent myIntent = new Intent(view.getContext(),DavidRicardo.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }



                        else if (position==5){
                            Intent myIntent = new Intent(view.getContext(),FredericBastiat.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }

                        else if (position==6){
                            Intent myIntent = new Intent(view.getContext(),AlexisToc.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }


                        else if (position==7){
                            Intent myIntent = new Intent(view.getContext(),JohnStuartMill.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }

                        else if (position==8){
                            Intent myIntent = new Intent(view.getContext(),JuanBautistaAlberdi.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }

                        else if (position==9){
                            Intent myIntent = new Intent(view.getContext(),HerbertSpencer.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }

                        else if (position==10){
                            Intent myIntent = new Intent(view.getContext(),CarlMenger.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }

                        else if (position==11){
                            Intent myIntent = new Intent(view.getContext(),JohnDewey.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }


                        else if (position==12){
                            Intent myIntent = new Intent(view.getContext(),LeonardTrelawny.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }

                        else if (position==13){
                            Intent myIntent = new Intent(view.getContext(),BenedettoCroce.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }

                        else if (position==14){
                            Intent myIntent = new Intent(view.getContext(),LudwigVonMises.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }


                        else if (position==15){
                            Intent myIntent = new Intent(view.getContext(),FriedrichHayek.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }
                        else if (position==16){
                            Intent myIntent = new Intent(view.getContext(),KarlPopper.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }
                        else if (position==17){
                            Intent myIntent = new Intent(view.getContext(),RaymondAron.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }
                        else if (position==18){
                            Intent myIntent = new Intent(view.getContext(),IsaiahBerlin.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }

                        else if (position==19){
                            Intent myIntent = new Intent(view.getContext(),NorbertoBobbio.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }


                        else if (position==20){
                            Intent myIntent = new Intent(view.getContext(),MiltonFriedman.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }

                        else if (position==21){
                            Intent myIntent = new Intent(view.getContext(),JamesMBuchanan.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }

                        else if (position==22){
                            Intent myIntent = new Intent(view.getContext(),JohnRawls.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }

                        else if (position==23){
                            Intent myIntent = new Intent(view.getContext(),MurrayRothbard.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }


                        else if (position==24){
                            Intent myIntent = new Intent(view.getContext(),RonaldDworkin.class);
                            startActivityForResult(myIntent, 0);
                            lista.setEnabled(false);
                            overridePendingTransition( R.anim.left_in,R.anim.left_out );
                        }

                    }







                });




    }
    @Override
    protected void onResume() {
        super.onResume();
        lista.setEnabled(true);

    }



    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate( R.menu.overflow,menu );
        return true;

    }



    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id==R.id.item1){
            Intent i = new Intent( MainActivity.this, ElLiberalismo.class );
            startActivity( i );
            lista.setEnabled(false);
            overridePendingTransition( R.anim.left_in, R.anim.left_out );
            return true;


        } else if (id==R.id.item2){
            Intent i = new Intent(MainActivity.this, SobreNosotros.class);
            startActivity(i);
            lista.setEnabled(false);
            overridePendingTransition( R.anim.left_in,R.anim.left_out );
            return true;

        } else if (id==R.id.item3) {
            Intent i = new Intent( MainActivity.this, Contacto.class );
            startActivity( i );
            lista.setEnabled(false);
            overridePendingTransition( R.anim.left_in, R.anim.left_out );
            return true;

        } else if (id==R.id.compartir){


                Intent i = new Intent( Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra( Intent.EXTRA_TEXT, "¡Descarga nuestra app! Ya tenemos nuestra propia app: \n  \n LECTURA LIBERAL, donde podrás encontrar diferentes autores que defendieron el Liberalismo en lo económico y social. También podrás encontrar algunas de sus obras. \n \n ¡Viva la Libertad! \n \n  https://play.google.com/store/apps/details?id=com.elcapitalchile.lecturaliberal");
                startActivity(Intent.createChooser( i, "Compartir vía"));
                lista.setEnabled(false);

                return true;
        }

        return super.onOptionsItemSelected( item );


    }




    @Override
    public boolean onPrepareOptionsMenu (final Menu menu) {
        MenuItem menuItem = menu.findItem( R.id.compartir );
        menuItem.setOnMenuItemClickListener( new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (SystemClock.elapsedRealtime() - mLastClickTime < 1000){
                    return true;
                }

                mLastClickTime = SystemClock.elapsedRealtime();

                // do your magic here

                Intent i = new Intent( Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra( Intent.EXTRA_TEXT, "¡Descarga nuestra app! Ya tenemos nuestra propia app: \n  \n LECTURA LIBERAL, donde podrás encontrar diferentes autores que defendieron el Liberalismo en lo económico y social. También podrás encontrar algunas de sus obras. \n \n ¡Viva la Libertad! \n \n  https://play.google.com/store/apps/details?id=com.elcapitalchile.lecturaliberal");
                startActivity(Intent.createChooser( i, "Compartir vía"));
                lista.setEnabled(false);
                return true;
            }
        });


        return true;
    }







    @Override
    public void onBackPressed() {
        super.onBackPressed();



    }




}
