# contexto-bot
Bot do Telegram inspirado no jogo Contexto, que utiliza word embeddings e similaridade de cosseno para gerar um ranking semântico de palavras com base na proximidade em relação à palavra secreta.

O jogador deve descobrir a palavra secreta por meio de tentativas. A cada tentativa, o sistema informa o quão próxima a palavra inserida está da palavra-alvo, utilizando similaridade de cosseno entre seus word embeddings.