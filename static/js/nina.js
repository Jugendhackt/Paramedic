get_nina_results(12);

async function get_nina_results(kreis_id){
   const data = await fetch("https://nina.api.proxy.bund.dev/api31/dashboard/091620000000.json").then(res => res.json()).then( data => data)
    console.log(data)
}