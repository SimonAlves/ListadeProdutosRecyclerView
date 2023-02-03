# Listade ProdutosRecyclerView

Listade Produtos RecyclerView  é o Segundo aplicativo que desenvolvi para dar meus primeiros passos com desenvolvimento Android. 


## :camera_flash: Screenshots
<!-- You can add more screenshots here if you like -->
<img src="/result/Screenshot_20230201_005604.png" width="260">

## Tecnologias
* Kotlin
* ViewGroup
 - Utilizei ConstraintLayout como layout personalizado para que cada item no RecyclerView, para criar um layouts complexos e flexíveis para cada item da lista, 
 sem prejudicar o desempenho do aplicativo.
 - Components de UI
    - TextView
    
    - ImageView
    
    - EditText
    
    - R.drawable Gerou automaticamente no Android os recursos de imagem incluídos para Lista de Produtos.
    
    - Tema "Theme.MaterialComponents.DayNight.DarkActionBar" : como base e personalizando várias cores, como a cor principal, secundária, cor na cor principal,
    ficando com visual mais limpo.
    
RecyclerView Principais funções utilizadas :

  - setAdapter: para definir o adaptador que fornecerá os dados a serem exibidos na lista.
  - ToPosition: para rolar a lista para uma determinada posição.
  - findViewHolderForAdapterPosition: para encontrar o ViewHolder associado a uma determinada posição no adaptador.
  - SupportActionBar : barra de ação para o aplicativo. 
  


## Author
Simon Alves Rodrigues Souza  (follow me on [Likendin](https://www.linkedin.com/in/simonalvesrodrigues/))

## License
```
The MIT License (MIT)

Copyright (c) 2023 Simon Alves Rodrigues Souza

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
