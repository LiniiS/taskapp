# Projeto Educativo: Aplicativo de Autenticação em Android

## Visão Geral

Este projeto foi criado para ensinar os conceitos fundamentais de **autenticação** em aplicativos Android. Ele explora como implementar uma **tela de login** simulada com verificação de nome de usuário e senha, além de abordar os principais conceitos de **autenticação local**. O projeto serve como ponto de partida para alunos iniciantes aprenderem sobre **autenticação**, **passagem de parâmetros entre Activities**, e **tratamento de eventos** em Android.

## Objetivos

O projeto foi desenvolvido para:

- Demonstrar a implementação de uma tela simples de **login**.
- Explorar o conceito de **autenticação** e **passagem de parâmetros** entre diferentes telas (Activities).
- Introduzir os conceitos de **tratamento de eventos** em botões e campos de entrada de texto.
- Oferecer um exemplo prático e educacional para servir como base para projetos mais avançados envolvendo autenticação.

## Funcionalidades

1. **Tela de Login Simulada**:
   - Verifica as credenciais do usuário (nome de usuário e senha) localmente.
   - Exibe mensagens de erro caso as credenciais estejam incorretas.
   - Redireciona o usuário para uma segunda tela (_MainActivity_) em caso de sucesso.

2. **Autenticação Local**:
   - Autenticação básica comparando as entradas do usuário com um nome de usuário e senha pré-definidos.
   - Simula o processo de autenticação de login sem necessidade de servidor ou backend.

3. **Tratamento de Eventos**:
   - Usa _listeners_ para capturar cliques no botão de login e validar as credenciais.

## Estrutura do Projeto

O projeto é dividido em duas principais _Activities_:

- **LoginActivity**: Tela de login, onde o usuário insere o nome de usuário e a senha.
- **MainActivity**: Tela para a qual o usuário é redirecionado após o login bem-sucedido.

### Arquivos Importantes

- **`LoginActivity.java`**: Contém a lógica de autenticação e tratamento de eventos de login.
- **`activity_login.xml`**: Layout da tela de login, com campos de entrada e um botão.
- **`MainActivity.java`**: Tela exibida após o login bem-sucedido (pode ser expandida com funcionalidades adicionais).
- **`activity_main.xml`**: Layout da tela principal, onde o conteúdo pós-login será exibido.

### Fluxo do Projeto

1. O usuário insere o nome de usuário e a senha na tela de login.
2. Ao clicar no botão "Entrar", as credenciais são verificadas:
   - Se forem válidas, o usuário é redirecionado para a tela principal.
   - Se forem inválidas, uma mensagem de erro é exibida.

## Requisitos

- **Android Studio** (versão mais recente recomendada).
- **Emulador Android** ou dispositivo físico para rodar o aplicativo.
- Conexão à internet apenas para instalação de bibliotecas (Firebase não é utilizado nesse exemplo, mas pode ser integrado futuramente).

## Como Executar o Projeto
1. **Clone o repo**:
```bash
git clone https://github.com/LiniiS/taskapp
```

2. **Abra o projeto no Android Studio**:
    - Selecione "Open an Existing Project" e navegue até a pasta clonada.
  
3. **Compile e execute** o projeto no emulador ou dispositivo Android conectado.

4. Interaja com a tela de login:
    - Use o nome de usuário: admin
    - Use a senha: 1234

5. Se o login for bem-sucedido, você será redirecionado para a tela principal. Se as credenciais estiverem incorretas, uma mensagem de erro será exibida.

## Conceitos Explorados
1. Autenticação Local
    - O projeto simula um sistema básico de autenticação com verificação de credenciais diretamente no código.
    - Esse conceito pode ser facilmente expandido para incluir autenticação baseada em servidor, como o uso de Firebase Authentication.

2. Passagem de Parâmetros entre Activities
    - O projeto demonstra como passar informações de uma Activity para outra usando Intent e como recuperar esses dados na segunda tela.
3. Tratamento de Eventos
    - O tratamento de eventos, como cliques no botão de login, é feito usando OnClickListener.
    - O código ensina como lidar com eventos de UI e executar ações baseadas na entrada do usuário.
## Melhorias Futuras
- Integração com Firebase Authentication: Substituir o login simulado por uma autenticação real com Firebase.
- Autenticação com OAuth: Adicionar suporte para login com Google ou Facebook usando OAuth.
- Armazenamento Seguro de Credenciais: Implementar armazenamento seguro de credenciais usando SharedPreferences ou criptografia.
- Autenticação de Dois Fatores (2FA): Implementar 2FA como uma camada adicional de segurança.

## Recursos Adicionais
- [Documentação Oficial do Android](https://developer.android.com/docs)
- [Firebase Authentication](https://firebase.google.com/docs/auth)
- [OAuth para Android](https://oauth.net/2/)

