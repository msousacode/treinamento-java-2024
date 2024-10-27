chrome.runtime.onMessage.addListener((message, sender, sendResponse) => {
    if (message.deckId) {
        alert(`Deck ID: ${message.deckId}`);
    }
});
