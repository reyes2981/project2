### Option2

- Persist at least **three models** eg: (`User`, `Post`, `Comment`) to a PostgreSQL database. X
- At least one API endpoint must perform full CRUD **create, read, update, and delete actions**. X
- Other API endpoints can perform CRUD based on the business use-case.
- Use Spring Profiles for environment settings. X
- Use  **JSON Web Tokens** in Spring Security to power user authentication.
- **Protect the routes** with JWT, except for user sign-up and login.
- Expose APIs to perform **user login and sign-up**.
- Expose APIs to perform **create, read, update, and delete actions** .
- **Handle exceptions** gracefully. X
- Send appropriate messages back to the client in the event that an exception occurs. X
- Must have `Controller` and  `Service` separate. X
- Document each end-point

| Request Type | URL| Reqtest Body | Request Header |
|--|--|--|--|
| GET | /api/categories/ | None | Authorization Bearer TOKEN

- Stick with the **KISS** (keep it simple, stupid) and **DRY** (don't repeat yourself) principles.

### Bonus Ideas
- Expose an API to update their own user profile.
- Add more unit tests.
- Implement integration tests.
- Allow a user to update their password.
- Allow a user to add a comment within another comment.
- 

types of roles
admin
jobseeker
