window.addEventListener('load', () => {
    
    if ('serviceWorker' in navigator) {
        console.log("hello")
        navigator.serviceWorker.register('/static/js/worker.js')
        .then(function(registration) {
        console.log('Registration successful, scope is:', registration.scope);
        })
        .catch(function(error) {
        console.log('Service worker registration failed, error:', error);
        });
    }
})