// Cria um alarme para rodar a cada 1 minuto
chrome.runtime.onInstalled.addListener(() => {
    chrome.alarms.create("fetchDeckIdAlarm", { periodInMinutes: 1 });
});

// Quando o alarme dispara, ele chama a API e envia o deck_id ao content script
chrome.alarms.onAlarm.addListener(async (alarm) => {
    if (alarm.name === "fetchDeckIdAlarm") {
        try {
            const response = await fetch('https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1');
            const data = await response.json();
            // Envia o deck_id para o content script na aba ativa
            chrome.tabs.query({ active: true, currentWindow: true }, (tabs) => {
                chrome.tabs.sendMessage(tabs[0].id, { deckId: data.deck_id });
            });
        } catch (error) {
            console.error("Erro ao buscar o deck ID:", error);
        }
    }
});
