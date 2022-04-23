resolve_data();

async function get_nina_results(){
   return await fetch("https://nina.api.proxy.bund.dev/api31/mowas/mapData.json", {mode:'no-cors'})
}
async function resolve_data(){
    data = await get_nina_results();
    console.log(data)
}


// var xhr = new XMLHttpRequest();
// xhr.onreadystatechange = function() {
//     if (xhr.readyState == XMLHttpRequest.DONE) {
//         alert(xhr.responseText);
//     }
// }
// xhr.open('GET', 'https://nina.api.proxy.bund.dev/api31/mowas/mapData.json', false);
// xhr.send(null);

// console.log(xhr.responseText)