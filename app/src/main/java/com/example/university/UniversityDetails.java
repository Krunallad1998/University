package com.example.university;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class UniversityDetails extends AppCompatActivity {
    TextView uni_domain,uni_name,uni_alphaCode,uni_state,uni_country,uni_webPage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_unidetails );
        Bundle extras = getIntent().getExtras();
        String p = extras.getString("position");

        int position=Integer.parseInt(p);
        ArrayList<University> universities=new ArrayList<University>();
        universities.add( new University( "davietjal.org", "http://www.davietjal.org/", "DAV Institute of Engineering & Technology", "IN", "Punjab", "India" ));
        universities.add( new University( "lpu.in", "http://www.lpu.in/\"", "Lovely Professional University", "IN", "Punjab", "India" ));
        universities.add( new University( "somaiya.edu", "\"https://somaiya.edu/\"", "Somaiya Vidyavihar", "IN", "null", "India" ));
        universities.add( new University( "ncuindia.edu", "http://www.ncuindia.edu/", "NorthCap University", "IN", "Haryana", "India" ));
        universities.add( new University( "ddu.ac.in", "http://www.ddu.ac.in","Dharamsinh Desai University","IN", "Gujarat", "India" ));
        universities.add( new University( "ntruhs.ap.nic.in", "http://ntruhs.ap.nic.in/","University of Health Sciences Andhra Pradesh","IN","Andhra Pradesh", "India" ));
        universities.add( new University( "aaidu.org","http://www.aaidu.org/","Allahabad Agricultural Institute, Deemed University","IN"," null", "India" ));
        universities.add( new University( "aau.ac.in","http://www.aau.ac.in/","Assam Agricultural University","IN","Assam", "India" ));
        universities.add( new University( "ahduni.edu.in", "http://www.ahduni.edu.in/","Ahmedabad University","IN","Gujarat", "India" ));
        universities.add( new University( "aiims.ac.in","http://www.aiims.ac.in/",  "All India Institute of Medical Sciences",  "IN",  "null", "India" ));
        universities.add( new University( "aisectuniversity.ac.in","http://www.aisectuniversity.ac.in/","AISECT University", "IN","Kerala", "India" ));
        universities.add( new University( "alagappauniversity.ac.in", "http://www.alagappauniversity.ac.in/", "Alagappa University",  "IN","Tamil Nadu", "India" ));
        universities.add( new University( "alldunivpio.org", "http://www.alldunivpio.org/", "Allahabad University", "IN","Uttar Pradesh", "India" ));
        universities.add( new University( "altmeduniversity.com","http://www.altmeduniversity.com/","Open International University for Alternative Medicines",  "IN","Punjab","India" ));
        universities.add( new University( "altmedworld.net", "http://www.altmedworld.net/", "Indian Board of Alternative Medicine","IN","West Bengal", "India" ));
        universities.add( new University( "amity.edu", "http://www.amity.edu/","Amity University","IN","Delhi", "India" ));
        universities.add( new University( "amrita.edu", "http://www.amrita.edu/","Amrita Vishwa Vidyapeetham (Deemed University)","IN", " null", "India" ));
        universities.add( new University( "amtuni.com", "http://www.amtuni.com/", "Amravati University","IN", " null","India" ));
        universities.add( new University( "amu.ac.in","http://www.amu.ac.in/","Aligarh Muslim University","IN", " null", "India" ));
        universities.add( new University( "andhrauniversity.info", "http://www.andhrauniversity.info/", "Andhra University", "IN",  "null", "India" ));
        universities.add( new University( "angrau.net", "http://www.angrau.net/", "Acharya Ranga Agricultural University", "IN", "Punjab", "India" ));

        uni_domain=findViewById( R.id.uni_domain );
        uni_webPage=findViewById( R.id.uni_webpages) ;
        uni_name=findViewById( R.id.uni_name) ;
        uni_alphaCode=findViewById( R.id.uni_codepath) ;
        uni_state=findViewById( R.id.uni_state) ;
        uni_country=findViewById( R.id.uni_country) ;



        uni_name.setText( universities.get( position ).getUni_name() );
        uni_domain.setText( universities.get( position ).getUni_domain() );
        uni_webPage.setText( universities.get( position ).getUni_webPage() );
        uni_state.setText( universities.get( position ).getUni_state() );
        uni_alphaCode.setText( universities.get( position ).getUni_alphaCode() );
        uni_country.setText( universities.get( position ).getUni_country() );



    }
}
class University{
    String uni_domain,uni_name,uni_alphaCode,uni_state,uni_country,uni_webPage;

    public String getUni_domain() {
        return uni_domain;
    }

    public University(String uni_domain, String uni_webPage, String uni_name, String uni_alphaCode, String uni_state, String uni_country) {
        this.uni_domain=uni_domain;
        this.uni_name = uni_name;
        this.uni_alphaCode = uni_alphaCode;
        this.uni_state = uni_state;
        this.uni_country = uni_country;
        this.uni_webPage = uni_webPage;
    }

    public String getUni_name() {
            return uni_name;
        }

        public void setUni_name(String uni_name) {
            this.uni_name = uni_name;
        }

        public String getUni_alphaCode() {
            return uni_alphaCode;
        }

        public void setUni_alphaCode(String uni_alphaCode) {
            this.uni_alphaCode = uni_alphaCode;
        }

        public String getUni_state() {
            return uni_state;
        }

        public void setUni_state(String uni_state) {
            this.uni_state = uni_state;
        }

        public String getUni_country() {
            return uni_country;
        }

        public void setUni_country(String uni_country) {
            this.uni_country = uni_country;
        }

        public String getUni_webPage() {
            return uni_webPage;
        }

        public void setUni_webPage(String uni_webPage) {
            this.uni_webPage = uni_webPage;
        }
 }