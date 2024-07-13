import mill._, scalalib._

object Spring extends JavaModule {
  def scalaVersion = "2.13.1"

  def ivyDeps = Agg(
ivy"org.duckdb:duckdb_jdbc:0.10.0"
    // Dependices
  )
}
