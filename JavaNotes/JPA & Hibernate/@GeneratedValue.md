Позволяет генерировать [идентификатор](@Id) [сущностей](@Entity), всегда используется в связке с [[@Id]]. По умолчанию стоит strategy = GenerationType.AUTO, существует 4 стандартные стратегии по спецификации JPA:

1. GenerationType.AUTO — [[Hibernate]] сам выбирает подходящий генератор в зависимости от СУБД:
    - PostgreSQL — GenerationType.SEQUENCE
    - MySQL — GenerationType.IDENTITY
    - Oracle — GenerationType.SEQUENCE
    - H2 (in-memory бд) — GenerationType.SEQUENCE
2. GenerationType.IDENTITY — автоинкремент, генерация происходит на стороне бд.
3. GenerationType.SEQUENCE — работает по такому же принципу как и IDENTITY, однако в нём больше возможностей, например мы можем заранее знать id без INSERT в бд. Работает как отдельный объект, а не просто инкремент перед коммитом
4. GenerationType.TABLE — 