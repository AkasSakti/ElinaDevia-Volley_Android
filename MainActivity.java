//tambahkan
   // MainActivity.java
   RequestQueue queue = Volley.newRequestQueue(this);
   String url = "https://api.example.com/endpoint";

   JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null,
           new Response.Listener<JSONArray>() {
               @Override
               public void onResponse(JSONArray response) {
                   // Proses data
               }
           }, new Response.ErrorListener() {
       @Override
       public void onErrorResponse(VolleyError error) {
           // Tangani kesalahan
       }
   });

   queue.add(jsonArrayRequest);
