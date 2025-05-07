// First code

import MistralClient from "@mistralai/mistralai";

const apiKey = process.env.MISTRAL_API_KEY || '';
const client = new MistralClient(apiKey);

const chatResponse = await client.chat({
    model: 'mistral-tiny',
    messages: [{
        role: 'user',
        content: 'Bom dia?'
    }]
});

console.log(chatResponse.choices[0].message.content);