document.getElementById('fetchDeckId').addEventListener('click', async () => {
    
    try {
        const response = await fetch('https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1');
        const data = await response.json(); // Converte a resposta em JSON
        alert(data.deck_id); // Acessa o atributo deck_id no objeto JSON
        /*
        const data = await response.json();
        if (data.success) {
            document.getElementById('deckIdText').textContent = `Deck ID: ${data.deck_id}`;
            $('#deckModal').modal('show');
        } else {
            document.getElementById('deckIdText').textContent = 'Erro ao obter o Deck ID';
        }*/
    } catch (error) {
        document.getElementById('deckIdText').textContent = 'Erro de conexão com a API';
    }
});
