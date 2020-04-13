# Google Map

## Current Location

**Steps**

### Dependency

1. create empty project : google map exercise

2. add dependency: go to build.gradle (Module: app)

   ![image-20200402132724639](C:\Users\JYHwang\AppData\Roaming\Typora\typora-user-images\image-20200402132724639.png)

   

   app (right-click) => Open Module Settings => Dependencies => click + => Library Dependency 
   
   ![image-20200402135507326](C:\Users\JYHwang\AppData\Roaming\Typora\typora-user-images\image-20200402135507326.png)

   
   
   ![image-20200402135020138](C:\Users\JYHwang\AppData\Roaming\Typora\typora-user-images\image-20200402135020138.png)

### XML

3. go to res => string

   ![image-20200402132927121](C:\Users\JYHwang\AppData\Roaming\Typora\typora-user-images\image-20200402132927121.png)

   

4. go to manifests

   add internet, access_coarse_location, access_fine_location

   add map_key

   ![image-20200402133401857](C:\Users\JYHwang\AppData\Roaming\Typora\typora-user-images\image-20200402133401857.png)

   ![image-20200402133629347](C:\Users\JYHwang\AppData\Roaming\Typora\typora-user-images\image-20200402133629347.png)

   

5. go to activity_main XML

   ![image-20200402135146381](C:\Users\JYHwang\AppData\Roaming\Typora\typora-user-images\image-20200402135146381.png)

   

### Java

6. 코드

   ```
   package com.example.googldmapexercise;
   
   
   import androidx.annotation.NonNull;
   import androidx.core.app.ActivityCompat;
   import androidx.fragment.app.FragmentActivity;
   
   import android.Manifest;
   import android.content.pm.PackageManager;
   import android.location.Location;
   import android.os.Bundle;
   import android.widget.Toast;
   
   import com.google.android.gms.location.FusedLocationProviderClient;
   import com.google.android.gms.location.LocationServices;
   import com.google.android.gms.maps.CameraUpdateFactory;
   import com.google.android.gms.maps.GoogleMap;
   import com.google.android.gms.maps.OnMapReadyCallback;
   import com.google.android.gms.maps.SupportMapFragment;
   import com.google.android.gms.maps.model.LatLng;
   import com.google.android.gms.maps.model.MarkerOptions;
   import com.google.android.gms.tasks.OnSuccessListener;
   import com.google.android.gms.tasks.Task;
   
   public class MainActivity extends FragmentActivity implements OnMapReadyCallback {
       Location currentLocation;
       FusedLocationProviderClient fusedLocationProviderClient;
       private static final int REQUEST_CODE = 101;
   
       @Override
       protected void onCreate(Bundle savedInstanceState) {
           super.onCreate(savedInstanceState);
           setContentView(R.layout.current_location);
           fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);
           fetchLastLocation();
       }
       private void fetchLastLocation(){
           if(ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                                                                       != PackageManager.PERMISSION_GRANTED){
               ActivityCompat.requestPermissions(this, new String[]
                       {Manifest.permission.ACCESS_FINE_LOCATION},REQUEST_CODE);
               return;
           }
           Task<Location> task = fusedLocationProviderClient.getLastLocation();
           task.addOnSuccessListener(new OnSuccessListener<Location>() {
               @Override
               public void onSuccess(Location location) {
                   if(location != null){
                       currentLocation = location;
                       Toast.makeText(getApplicationContext(),currentLocation.getLatitude()
                       +""+currentLocation.getLongitude(),Toast.LENGTH_SHORT).show();
                       SupportMapFragment supportMapFragment = (SupportMapFragment)
                               getSupportFragmentManager().findFragmentById(R.id.google_map_current);
                       supportMapFragment.getMapAsync(MainActivity.this);
                   }
               }
           });
       }
   
       @Override
       public void onMapReady(GoogleMap googleMap) {
           LatLng latLng = new LatLng(currentLocation.getLatitude(),currentLocation.getLongitude());
           MarkerOptions markerOptions = new MarkerOptions().position(latLng).title("현재 위치입니다.");
           googleMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
           googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 6));
           googleMap.addMarker(markerOptions);
       }
   
       @Override
       public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
           switch (requestCode){
               case REQUEST_CODE:
                   if(grantResults.length>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED){
                       fetchLastLocation();
                   }
                   break;
           }
   
       }
   }
   
   ```

   

### Error

> 지도가 앱상으로 뜨지 않는다. 

![KakaoTalk_20200403_141653529](C:\Users\JYHwang\Downloads\KakaoTalk_20200403_141653529.png)

API KEY를 확인하기 위해 google cloud platform으로 접속했고

Restrict 설정으로 들어갔다. 

![image-20200403153906404](C:\Users\JYHwang\AppData\Roaming\Typora\typora-user-images\image-20200403153906404.png)

SHA-1 certificate fingerprint 를 받으려면

![image-20200403154014962](C:\Users\JYHwang\AppData\Roaming\Typora\typora-user-images\image-20200403154014962.png)

signingReport를 누르면 SHA1이 만들어진다.

![image-20200403154232423](C:\Users\JYHwang\AppData\Roaming\Typora\typora-user-images\image-20200403154232423.png)

![image-20200403154322850](C:\Users\JYHwang\AppData\Roaming\Typora\typora-user-images\image-20200403154322850.png)

설정하고 실행해도 맵이 작동하지 않는다...