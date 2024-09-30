// First Video - Playing in linear1
final VideoView vd1 = new VideoView(MainActivity.this);
vd1.setLayoutParams(new LinearLayout.LayoutParams(
        android.widget.LinearLayout.LayoutParams.MATCH_PARENT, 
        android.widget.LinearLayout.LayoutParams.MATCH_PARENT));



vd1.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video1));
vd1.requestFocus();
vd1.start();
vd1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
    public void onCompletion(MediaPlayer mp) {
        vd1.start(); // Loop video 1 when it completes
    }
});


RelativeLayout rl1 = new RelativeLayout(this);
RelativeLayout rl5 = new RelativeLayout(this);



rl1.addView(vd1, -1, -1); // Add first video to rl1


// Add the RelativeLayouts to their respective LinearLayouts
// First Video
linear1.removeAllViews();
linear1.addView(rl1, -1, -1); // Add rl1 to linear1
//this is for add any button and more aliments on videoviev up
rl1.addView(rl5, -1,-1);
rl1.addView(linear5, -1,-1);
