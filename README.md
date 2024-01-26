# Sobre o projeto

- o Projeto está organizado em duas pastas: frontend-calendar e calendario(backend)

### Frontend

- O projeto foi desenvolvido utilizando react, react-router-dom (rotas), bootstrap para estilização, react-hook-form para gerenciar os formulários e zod para auxiliar na validação e typescript.

**Ao baixar o projeto é preciso dar:**

- um npm install para baixar as dependencias
- npm run dev para startar o front-end

### Sobre a organização do projeto

Busquei organizar o projetos em pastas dentro do src

- assets: possui o svg do calendário ilustrativo
- componentes: componentes do projeto
- context: possui um gerenciador do userId
- hooks: possui chamadas para as apis, utilizando recursos do react
- lib: possui a configuração do axios
- pages: páginas de navegação
- routes: possui a configuração das rotas e um componente de proteção
- types: types que podem ser reutilizados
- utils: Possui funções a serem reutilizadas

### Backend

- O projeto foi desenvolvido utilizando java, spring boot, docker, postgree e lombok.

### Sobre a organização do projeto

exceptions: contém classes que representam exceções específicas do módulo
providers: possui o provider responsável para o tratamento do JWT
security: concentra funcionalidades relacionadas à segurança

- Foi desenvolvimento em uma arquitetura modular, onde cada entidade representa um módulo.
  modules:
  events: trata de funcionalidade relacionadas a eventos
  users: trata de funcionalidade relacionadas a usuários

dentro de cada módulo temos:
entities: armazena as classes que representam as entidades
useCases: casos de uso do módulo
controllers: classes que lidam com as solicitações http

- Para autenticação foi feito o desenvolvimento da camada de segurança, com a criação de tokens JWT.

### O que foi desenvolvido:

- [x] Cadastro de usuário
- [x] Login para acesso ao sistema
- [x] Adição de eventos
- [x] Edição de eventos
- [x] Remoção de eventos
- [x] Listagem de eventos
- [x] A entidade evento possui os atributos: descrição, hora de início e hora de término
- [x] A Validação para não deixar sobrescrever eventos e caso ocorra,
- [x] Emição de alerta para o usuário (no caso do evento sobrescrever outro durante a criação)
- [x] Possui suporte a vários usuários
- [x] Eventos ligados ao usuário que os criou
- [x] Frontend renderizado no lado do cliente
- [x] O sistema deverá exibir um aviso nessa lista se o projeto estiver com a entrega atrasada.
- [x] Eventos com duração de mais de um dia
- [x] Responsividade, assim como o uso de Bootstrap ou outro framework CSS
- [x] Funcionalidades novas:
  - Autenticação com jwt
  - Status para evento
  - Filtro de pesquisa por uma data inicial
  - Toast de erro (mostra mensagens do back)
  - Validação dos formulários
  - logout

### Links de apoio

- https://getbootstrap.com/
- https://reactrouter.com/docs/en/v6
- https://jwt.io/
- https://www.devmedia.com.br/uma-visao-sobre-o-projeto-lombok/28321
- https://react-hook-form.com/ts
