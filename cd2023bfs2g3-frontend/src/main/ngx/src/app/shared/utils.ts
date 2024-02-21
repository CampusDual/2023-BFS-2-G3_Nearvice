export function getLoggedUser() {
	const LOCAL_STORAGE_DATA = localStorage.getItem("com.campusdual.cd2023bfs2g3");
	const sessionData = JSON.parse(LOCAL_STORAGE_DATA);
	return sessionData.session.user;
}
