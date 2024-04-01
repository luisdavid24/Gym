loadClients();



async function requestHTTP(url,method){
    try {
        const request = await fetch(url, {
            method: method,
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            }
           
        });
        let data = await request.json();
        return data;
        
    
       
    } catch (error) {
        return null;
    }
    
}

async function loadClients() {
    try {
        let data = await requestHTTP('http://localhost:8080/customer', 'GET');

        console.log(data);
        let listadoHtml="";
        let element="";
        data.forEach(client => {
            element="<tr><td>"+client.id+"</td><td>"+client.name+"</td><td>"+client.lastName+"</td><td>"+client.gender+"</td>"
            +"<td>"+client.phone+"</td><td>"+client.objective+"</td><td>"+client.nameEmergency+"</td><td>"+client.lastEmergency+"</td>"
            +"<td>"+client.phoneEmergency+"</td></tr>";
            listadoHtml+=element;
            console.log(client);
        });
        console.log(listadoHtml);
        document.querySelector('#tableCustomer tbody').outerHTML = listadoHtml;
    } catch (error) {
        console.error("Error loading clients:", error);
    }
}



