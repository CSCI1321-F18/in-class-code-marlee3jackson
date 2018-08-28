package basics

class HitBox (
  private var cx: Double = 0.0
  private var cy : Double = 0.0
  val width = 1.0
  val height = 1.0
  ){
  def cx = cy
  val
  
  def intersect(other: HitBox): Boolean = {
    val overlapX = (cx-other.cx).abs<0.5*(width+other.width)
    val overlapY = (cy-other.cy).abs<0.5*(height+other.height)
    overlapX && overlapY
  }
}