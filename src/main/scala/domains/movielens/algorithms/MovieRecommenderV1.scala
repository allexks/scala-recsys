package domains.movielens.algorithms

import org.apache.spark.mllib.recommendation.{MatrixFactorizationModel, Rating}

import traits.Algorithm
import domains.movielens.datatransformers.MovieLensTransformer
import shared.trainables.ALSTrainer
import shared.testables.MatrixFactorizationModelTester

case class MovieRecommenderV1() extends Algorithm[Rating, MatrixFactorizationModel]:
  lazy val transformer = MovieLensTransformer()
  lazy val trainer = ALSTrainer()
  lazy val tester = MatrixFactorizationModelTester()
